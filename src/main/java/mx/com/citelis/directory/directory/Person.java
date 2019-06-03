package mx.com.citelis.directory.directory;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {

    @Id
    String email;
    String name;
}
