package faang.school.analytics.service;

import faang.school.analytics.dto.event.CommentEventDto;
import faang.school.analytics.mapper.AnalyticsEventMapper;
import faang.school.analytics.model.AnalyticsEvent;
import faang.school.analytics.repository.AnalyticsEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnalyticsEventService {
    private final AnalyticsEventRepository analyticsEventRepository;
    private final AnalyticsEventMapper analyticsEventMapper;

    public void saveCreateComment(CommentEventDto commentEventDto) {
        AnalyticsEvent analyticsEvent = analyticsEventMapper.toEntity(commentEventDto);
        analyticsEventRepository.save(analyticsEvent);

    }
}
