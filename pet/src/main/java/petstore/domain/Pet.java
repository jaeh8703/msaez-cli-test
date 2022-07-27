package petstore.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import petstore.PetApplication;
import petstore.domain.PetRegistered;

@Entity
@Table(name = "Pet_table")
@Data
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private Photo photo;

    private String name;

    private Integer energy;

    private Integer appearance;

    private Integer weight;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Type type;

    @ElementCollection
    private List<IllnessHistory> illnessHistory;

    @PostPersist
    public void onPostPersist() {
        PetRegistered petRegistered = new PetRegistered(this);
        petRegistered.publishAfterCommit();
    }

    public static PetRepository repository() {
        PetRepository petRepository = PetApplication.applicationContext.getBean(
            PetRepository.class
        );
        return petRepository;
    }

    public void feed123() {
        //
    }

    public void feed123aaaa() {
        //
    }

    public void combaaaaaasd123() {
        //
    }

    public void c123() {
        //
    }

    public void test2() {
        //
    }

    public void test3() {
        //
    }

    public void test5() {
        //
    }

    public void test6() {
        //
    }

    public void test7() {
        //
    }

    public void test8() {
        //
    }

    public void test9() {
        //
    }

    public void feed() {
        Overweighted overweighted = new Overweighted(this);
        overweighted.publishAfterCommit();

        Fed fed = new Fed(this);
        fed.publishAfterCommit();
    }
    public void groom() {
        //test
        //test124124124124
        //test
        //test
        //test
        //test
        //test
        //test
        //test
        //test
        //test
        //test
        //test21412421
        //test
        //test
        //test4124
        //test
        //test
    }

    public void comb() {}

    public void testa1() {
        // test
    }

    public void testa2() {
        // test 2
    }

    public void test66() {
        // test 666111!!!
    }

    public void test77() {
        // test 77123123
    }

    public void test88() {
        //test88888
    }

    public void test99() {}

}
