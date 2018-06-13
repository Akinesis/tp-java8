package java8.ex03;

import java8.data.Data;
import java8.data.Person;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Exercice 03 - ForEach
 */
public class Lambda_03_Test {

    // tag::PersonProcessor[]
    interface PersonProcessor {
        void process(Person p);
    }
    // end::PersonProcessor[]

    // tag::forEach[]
    private void forEach(List<Person> source, PersonProcessor processor) {
       
    	source.forEach(p -> processor.process(p));

    }
    // end::forEach[]


    // tag::test_verify_person[]
    @Test
    public void test_verify_person() throws Exception {

        List<Person> personList = Data.buildPersonList(100);

        // TODO vérifier qu'une personne à un prénom qui commence par first
        // TODO vérifier qu'une personne à un nom qui commence par last
        // TODO vérifier qu'une personne à un age > 0
        // TODO la vérification se fait via une assertion (mot clé assert)
        PersonProcessor verifyPerson = new PersonProcessor(){
			public void process(Person p) {
				Assert.assertTrue(p.getFirstname().substring(0, 5).equals("first"));
				Assert.assertTrue(p.getLastname().substring(0, 4).equals("last"));
				Assert.assertTrue(p.getAge() > 0);
			}
        };

        assert verifyPerson != null;

        forEach(personList, verifyPerson);
    }
    // end::test_verify_person[]

}
