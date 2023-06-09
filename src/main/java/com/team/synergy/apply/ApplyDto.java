package com.team.synergy.apply;

import com.team.synergy.member.Member;
import com.team.synergy.member.MemberDto;
import com.team.synergy.project.Project;
import com.team.synergy.project.ProjectDto;
import lombok.*;
import net.bytebuddy.asm.Advice;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@NoArgsConstructor
@Getter @Setter
public class ApplyDto {
    private LocalDateTime applyTime;
    private MemberDto memberDto;
    private ProjectDto projectDto;

    @Builder
    public ApplyDto(LocalDateTime applyTime, MemberDto memberDto, ProjectDto projectDto){
        this.applyTime = applyTime;
        this.memberDto = memberDto;
        this.projectDto = projectDto;
    }

    public static ApplyDto from(Apply apply){
        return ApplyDto.builder()
                .applyTime(apply.getApplyTime())
                .memberDto(MemberDto.from(apply.getMember()))
                .projectDto(ProjectDto.from(apply.getProject()))
                .build();
    }

    public static List<ApplyDto> of(List<Apply> applys){
        return applys.stream().map(apply -> ApplyDto.from(apply)).collect(Collectors.toList());
    }
}
