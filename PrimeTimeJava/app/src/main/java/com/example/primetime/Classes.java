package com.example.primetime;

import java.util.Date;
import java.util.List;

//회원가입
public class Registration {
    private String ID;
    private String PW;
    private String email;

    public boolean register(String ID, String PW, String email) {
        if (validateInput(ID, PW, email) && checkUsernameAvailability(ID)) {
            this.ID = ID;
            this.PW = PW;
            this.email = email;

        }

    }

    public boolean validateInput(String ID, String PW, String email) {

    }

    public boolean checkUsernameAvailability(String ID) {

    }
}

//로그인
public class Login {
    private String ID;
    private String PW;

    public boolean login(String ID, String PW) {
        if (validateCredentials(ID, PW)) {
            this.ID = ID;
            this.PW = PW;

        }
    }

    public boolean validateCredentials(String ID, String PW) {

    }

    public User fetchUserDetails(String ID) {

    }
}

//로그아웃
public class Logout {
    private int userNumber;

    public boolean logout(int userNumber) {
        this.userNumber = userNumber;
        clearSession(userNumber);

    }

    public void clearSession(int userNumber) {

    }
}

//스케줄 등록
public class AddSchedule {
    private int userNumber;
    private String title;
    private String description;
    private Date dateTime;

    public boolean addSchedule(int userNumber, String title, String description, Date dateTime) {
        if (validateSchedule(title, dateTime)) {
            this.userNumber = userNumber;
            this.title = title;
            this.description = description;
            this.dateTime = dateTime;

        }

    }

    public boolean validateSchedule(String title, Date dateTime) {

    }
}

//스케줄 수정
public class EditSchedule {
    private int scheduleNumber;
    private String title;
    private String description;
    private Date dateTime;

    public Schedule fetchSchedule(int scheduleNumber) {

    }

    public boolean editSchedule(int scheduleNumber, String title, String description, Date dateTime) {
        if (validateSchedule(title, dateTime)) {
            this.scheduleNumber = scheduleNumber;
            this.title = title;
            this.description = description;
            this.dateTime = dateTime;

        }
    }

    public boolean validateSchedule(String title, Date dateTime) {

    }
}

//스케줄 삭제
public class DeleteSchedule {
    private int scheduleNumber;

    public boolean deleteSchedule(int scheduleNumber) {
        if (confirmDelete(scheduleNumber)) {
            this.scheduleNumber = scheduleNumber;

        }
    }

    public boolean confirmDelete(int scheduleNumber) {

    }
}

//알림
public class Notification {
    private int scheduleNumber;
    private Date notificationTime;

    public boolean setNotification(int scheduleNumber, Date notificationTime) {
        this.scheduleNumber = scheduleNumber;
        this.notificationTime = notificationTime;

    }

    public void sendNotification(int scheduleNumber) {

    }

    public boolean cancelNotification(int scheduleNumber) {

    }
}

//월간 달력
public class MonthlyCalendar {
    private int year;
    private int month;

    public void displayCalendar(int year, int month) {
        this.year = year;
        this.month = month;

    }

    public List<Schedule> getSchedules(int year, int month) {
        this.year = year;
        this.month = month;

    }

    public void moveToPreviousMonth() {

    }

    public void moveToNextMonth() {

    }
}

//오늘 스케줄
public class SchedulesToday {
    private int userNumber;
    private Date date;

    public List<Schedule> getSchedulesToday(int userNumber, Date date) {
        this.userNumber = userNumber;
        this.date = date;

    }

    public void displaySchedulesToday(int userNumber) {
        this.userNumber = userNumber;

    }
}

public class User {
    private String ID;

    public User(String ID) {
        this.ID = ID;
    }

}

public class Schedule {
    private int scheduleNumber;
    private String title;
    private String description;
    private Date dateTime;

    public Schedule(int scheduleNumber, String title, String description, Date dateTime) {
        this.scheduleNumber = scheduleNumber;
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
    }

}
