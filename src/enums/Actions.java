package enums;

public enum Actions {
    KILL("Убить"),
    WEAR("Надеть"),
    RIDE("Ехать"),
    RUN("Бежать"),
    EAT("Есть"),
    TALK("Обсудить"),
    JOY("Радоваться");
    private final String action;
    Actions(String action) {
        this.action = action;
    }
    public String getAction() {
        return action;
    }

}
