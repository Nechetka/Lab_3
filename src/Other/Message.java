package Other;

public class Message {
    private final String author;
    private String text;
    private final String address;
    public Message (String author,String address){
        this.author = author;
        this.address = address;
        this.text = "";
    }
    public void addText(String text){
        this.text += text+".\n";
    }
    public String showFullLetter(){
        return "Письмо:\n'''Адрес:"+this.address + "\n" + text  + "Автор: " + author+"'''";
    }
    public  String showOlyFullText(){
        return text;
    }
}
