package lesson32.ClassWork.service;

import lesson32.ClassWork.event.PrintEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ServiceB implements ApplicationListener<PrintEvent> {

    @Override
    public void onApplicationEvent(PrintEvent event) {
        log.info("ServiceB catch event {}", event);
    }
}
