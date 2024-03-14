package zadanie2;

public class AdRecipient {
    private final String preferredLanguage;
    private final String contactInfo;

    public AdRecipient(String preferredLanguage, String contactInfo) {
        this.preferredLanguage = preferredLanguage;
        this.contactInfo = contactInfo;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}
