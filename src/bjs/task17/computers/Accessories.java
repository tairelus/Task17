package bjs.task17.computers;

/**
 * Created by U-1 on 30.11.2015.
 */
public interface Accessories {
    /**
     * Sets the keyboard
     * @param keyboard
     */
    void setKeyboard(String keyboard);

    /**
     * Sets the mouse
     * @param mouse
     */
    void setMouse(String mouse);

    /**
     * Sets the web camera
     * @param webcam
     */
    void setWebcam(String webcam);

    /**
     * Sets the headset
     * @param headset
     */
    void setHeadset(String headset);

    /**
     * Sets the audio system
     * @param audioSystem
     */
    void setAudioSystem(String audioSystem);

    /**
     * Returns all accessories as string
     * @return
     */
    String getAccessories();
}
