package com.example.login03102023.login_user;
import com.example.login03102023.beans.User;

public interface Contract {
    public interface View{
        public void successLogin(User user);
        void failureLogin(String err);
        //void failureLogin(MyException err);
    }
    public interface Presenter{
        //void login(String email, String pass);
        void login(User user);

        //void login(ViewUser viewUser);

    }
    public interface Model{
        interface OnLoginUserListener{
            void onFinished(User user);
            void onFailure(String err);

        }
        void loginAPI(User user,
                      OnLoginUserListener onLoginUserListener);
    }
}
