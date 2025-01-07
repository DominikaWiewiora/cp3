abstract class Message {
    private String text;

    public Message() {
        this.text = "";
    }

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    
    public void setText(String text) {
        this.text = text;
    }


    public int charNumber() {
        return text.length();
    }


    abstract void send();
}

