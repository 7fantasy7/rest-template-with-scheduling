package ru.zaimix.botynaov.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import ru.zaimix.botynaov.entity.UptimeRobotMonitors;
import ru.zaimix.botynaov.repository.UptimeRobotMonitorsRepository;
import ru.zaimix.botynaov.service.SequenceService;

@Component
public class UptimeRobotApiClient {

    private static final Logger LOG = LoggerFactory.getLogger(UptimeRobotApiClient.class);

    @Value("${config.api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SequenceService sequenceService;

    @Autowired
    private UptimeRobotMonitorsRepository uptimeRobotMonitorsRepository;

    @Scheduled(cron = "0 * * * * *")
    public void doSome() {
        MultiValueMap<String, String> form = new LinkedMultiValueMap<>();
        form.add("format", "json");
        form.add("api_key", apiKey);
        UptimeRobotMonitors fetchedMonitors = restTemplate.postForObject("https://api.uptimerobot.com/v2/getMonitors", form, UptimeRobotMonitors.class);
        fetchedMonitors.setId(sequenceService.getNextSequence("uptimeRobotMonitors"));
        uptimeRobotMonitorsRepository.save(fetchedMonitors);
        LOG.error(fetchedMonitors.toString());
    }

}
