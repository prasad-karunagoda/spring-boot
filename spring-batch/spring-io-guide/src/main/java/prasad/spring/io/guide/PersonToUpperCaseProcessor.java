package prasad.spring.io.guide;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonToUpperCaseProcessor implements ItemProcessor<Person, Person> {

    private static final Logger logger = LoggerFactory.getLogger(PersonToUpperCaseProcessor.class);

    @Override
    public Person process(final Person item) {
        Person upperCasePerson = new Person(item.firstName().toUpperCase(), item.lastName().toUpperCase());
        logger.info("Transform {} to {}", item, upperCasePerson);
        return upperCasePerson;
    }
}
