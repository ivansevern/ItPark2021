package lesson28.service.impl;

import lesson28.service.Arhiv;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "app.arhiv.enabled")
public class ArhivImpl implements Arhiv {

    @Override
    public void packaged() {
        System.out.println("Заархивировано!");
    }
}
