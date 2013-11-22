package de.collectionGame;
public class GlobalSettings {
    // Attributes
    private boolean musicMuted;
    private boolean soundeffectsMuted;
    private int[] resolution;
    
    // Constructors
    public GlobalSettings() {
        this.resolution = new int[2];
        this.resetSettings();
    }
    
    public GlobalSettings(boolean musicMuted, boolean soundeffectsMuted, int[] resolution) {
        this.musicMuted = musicMuted;
        this.soundeffectsMuted = soundeffectsMuted;
        this.resolution = resolution;
    }

    // Methods
    public boolean getMusicMuted() {
        return this.musicMuted;
    }

    public void setMusicMuted(boolean musicMuted) {
        this.musicMuted = musicMuted;
    }

    public boolean getSoundeffectsMuted() {
        return this.soundeffectsMuted;
    }

    public void setSoundeffectsMuted(boolean soundeffectsMuted) {
        this.soundeffectsMuted = soundeffectsMuted;
    }

    public int[] getResolution() {
        return this.resolution;
    }

    public void setResolution(int x, int y) {
        this.resolution[0] = x;
        this.resolution[1] = y;
    }

    public void resetSettings() {
        this.musicMuted = false;
        this.soundeffectsMuted = false;
        this.resolution[0] = 800;
        this.resolution[1] = 600;
    }

    public void save() {
        // to be implemented later
    }
}
