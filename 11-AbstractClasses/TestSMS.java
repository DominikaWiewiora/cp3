public class TestSMS {
    public static void main(String[] args) {
        // Creating User objects
        User user1 = new User("John", "Doe", "john.doe@example.com", "123-456-7890");
        User user2 = new User("Jane", "Smith", "jane.smith@example.com", "987-654-3210");

        // Creating and sending SMS
        SMS sms1 = new SMS(user1, "Hey, don't forget about the meeting tomorrow!");
        SMS sms2 = new SMS(user2, "Your appointment is scheduled for 3 PM today.");
        sms1.send();
        System.out.println();
        sms2.send();
        System.out.println();

        // Creating and sending Email
        Email email1 = new Email("Meeting Reminder", user1, "The meeting is scheduled for 10 AM.");
        Email email2 = new Email("Project Update", user2, "The project is on track. Let's meet next week.");
        email1.send();
        System.out.println();
        email2.send();
    }
}
