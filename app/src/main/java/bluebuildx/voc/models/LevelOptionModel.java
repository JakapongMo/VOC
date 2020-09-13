package bluebuildx.voc.models;

public class LevelOptionModel {
    private String imageUrl;
    private String level;
    private String description;

    public LevelOptionModel(String imageUrl, String level, String description) {
        this.imageUrl = imageUrl;
        this.level = level;
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

