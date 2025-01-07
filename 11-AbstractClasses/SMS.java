class SMS extends Message {
    private User recipient; // Use User object for recipient details

    // Constructor to initialize the recipient User and message content
    public SMS(User recipient, String text) {
        super(text); // Calling the constructor of the superclass (Message)
        this.recipient = recipient;
    }

    // Accessor method for the recipient
    public User getRecipient() {
        return recipient;
    }

    // Mutator method for the recipient
    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    // Implement the send() method from the Message class
    @Override
    public void send() {
        System.out.println("Sending SMS to: " + recipient.getPhoneNumber());
        System.out.println("Message: " + getText());
        System.out.println("Character count: " + charNumber() + " characters");
    }
}

