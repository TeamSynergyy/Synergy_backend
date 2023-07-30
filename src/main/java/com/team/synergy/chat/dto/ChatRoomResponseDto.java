//package com.team.synergy.chat.dto;
//
//import com.team.synergy.chat.domain.ChatRoom;
//import lombok.Getter;
//
//import java.time.format.DateTimeFormatter;
//
//@Getter
//public class ChatRoomResponseDto {
//    private Long id;
//    private String roomName;
//    private String createdDate;
//    private String updatedDate;
//
//    public ChatRoomResponseDto(ChatRoom entity) {
//        this.id = entity.getId();
//        this.roomName = entity.getRoomName();
//        this.createdDate = entity.getCreatedDate().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
//        this.updatedDate = entity.getUpdatedDate().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
//    }
//}
