package faang.school.analytics.mapper;

import faang.school.analytics.dto.event.CommentEventDto;
import faang.school.analytics.model.AnalyticsEvent;
import faang.school.analytics.model.EventType;
import org.springframework.stereotype.Component;

@Component
public class AnalyticsEventMapper {

    public AnalyticsEvent toEntity(CommentEventDto commentEventDto) {
        return AnalyticsEvent.builder()
            .id(commentEventDto.getId())
            .receiverId(commentEventDto.getPostId())
            .actorId(commentEventDto.getAuthorId())
            .eventType(EventType.POST_COMMENT)
            .receivedAt(commentEventDto.getCreatedAt())
            .build();

    }
}
