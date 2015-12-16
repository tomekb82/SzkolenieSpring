package pl.sages.spring.lab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import pl.sages.spring.lab.dao.ClientDAO;
import pl.sages.spring.lab.model.Client;
import pl.sages.spring.lab.model.Contact;

/**
 * Created by Administrator on 2015-12-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
@TransactionConfiguration(defaultRollback = false)
public class ClientDaoTest {

    @Autowired
    private ClientDAO clientDAO;

    @Test
    @Transactional
    public void testClientDao(){
        Client client = new Client();
        Contact contact = new Contact();
        contact.setPhone("48843179");
        client.setContact(contact);
        clientDAO.save(client);
        Client c = clientDAO.findOne(client.getId());
        System.out.println(c);

        assert client.equals(c);
    }
}
