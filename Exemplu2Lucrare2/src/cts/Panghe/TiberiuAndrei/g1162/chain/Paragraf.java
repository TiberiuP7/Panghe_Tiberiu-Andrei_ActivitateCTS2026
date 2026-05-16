package cts.Panghe.TiberiuAndrei.g1162.chain;

public class Paragraf implements Item {
    private String text;
    private String culoare;
    private String setari;

    public Paragraf(String text, String culoare, String setari) {
        this.text = text;
        this.culoare = culoare;
        this.setari = setari;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getSetari() {
        return setari;
    }

    public void setSetari(String setari) {
        this.setari = setari;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paragraf{");
        sb.append("text='").append(text).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", setari='").append(setari).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
