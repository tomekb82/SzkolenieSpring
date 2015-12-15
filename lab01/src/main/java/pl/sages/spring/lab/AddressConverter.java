package pl.sages.spring.lab;

import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

/**
 * Created by Administrator on 2015-12-14.
 */
@Component
public class AddressConverter extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        BasicAddress address = new BasicAddress();
        address.setCity(parse(text, 0));
        address.setStreet(parse(text, 1));
        address.setNumber(Integer.valueOf(parse(text, 2)));
        setValue(address);
    }

    public String parse(String text, int num) {
        String[] parts = text.split(":");
        return parts[num];
    }
}
