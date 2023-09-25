package car;

public class Name {
    private final String name;

    public Name(String name){
        if (name.length() > 5) {
            throw new RuntimeException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
