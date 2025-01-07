public interface CanChangeChannel {
    void channelUp();           // Increment the channel number
    void channelDown();         // Decrement the channel number
    void setChannel(int channelNo); // Set the TV to a specific channel
}