package com.example.otams_project;
//Backend code for admin activity
public class AdminActions {
    private final FirebaseAccessor accessor;

    public AdminActions() {
        accessor = new FirebaseAccessor();
    }

    public void loadPendingAccounts(AdminCallback callback) {
        accessor.getPendingAccounts(callback);
    }

    public void loadRejectedAccounts(AdminCallback callback) {
        accessor.getRejectedAccounts(callback);
    }

    public void approveAccount(Account account, ApprovalCallback callback) {
        accessor.approveAccount(account.getEmail(), new ApprovalCallback() {


            @Override
            public void onApprovalSuccess() {
                account.setStatus("approved");
                Emailer.sendEmailForRegistrationStatus(account, true);
                callback.onApprovalSuccess();
            }

            @Override
            public void onApprovalFailure(String message) {
                callback.onApprovalFailure(message);
            }
        });
    }
    public void rejectAccount(Account account, ApprovalCallback callback) {
        accessor.rejectAccount(account.getEmail(), new ApprovalCallback() {


            @Override
            public void onApprovalSuccess() {
                account.setStatus("rejected");
                Emailer.sendEmailForRegistrationStatus(account, false);
                callback.onApprovalSuccess();
            }

            @Override
            public void onApprovalFailure(String message) {
                callback.onApprovalFailure(message);
            }
        });
    }
    public void reloadAccounts(String status , AdminCallback callback){ //general method to reload accounts from database
        if(status.equals("pending")){
            loadPendingAccounts(callback);
        }
        else{
            loadRejectedAccounts(callback);
        }
    }




}
