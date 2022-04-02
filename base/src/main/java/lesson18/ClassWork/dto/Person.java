package lesson18.ClassWork.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@EqualsAndHashCode//(exclude = "height")
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 2L;

    private String name;
    private int age;
    private Sex sex;
    private double height;

    public Person(String name) {
        this.name = name;
    }

    public void beOlder() throws Exception {
        this.age++;
    }

//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(this);
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//
//    }
}
