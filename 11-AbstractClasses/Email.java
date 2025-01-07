class Email extends Message {
    private User recipient; // Use User object for recipient details
    private String subject;

    // Constructor to initialize the subject, recipient User, and message content
    public Email(String subject, User recipient, String text) {
        super(text);  // Calling the constructor of the superclass (Message)
        this.subject = subject;
        this.recipient = recipient;
    }

    // Accessor methods
    public String getSubject() {
        return subject;
    }

    public User getRecipient() {
        return recipient;
    }

    // Mutator methods
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    // Implement the send() method from the Message class
    @Override
    public void send() {
        System.out.println("Sending Email to: " + recipient.getEmail());
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + getText());
        System.out.println("Character count: " + charNumber() + " characters");
    }
}