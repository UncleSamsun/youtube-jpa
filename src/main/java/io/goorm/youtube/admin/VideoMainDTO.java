package io.goorm.youtube.admin;

import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;

public interface VideoMainDTO {

    Long getVideoSeq();
    String getVideo();
    String getVideoThumnail();
    String getTitle();
    LocalDateTime getRegDate();


    @Value("#{@dateFormatter.formatDateTime(target.regDate)}")
    String getFormattedRegDate();

}
