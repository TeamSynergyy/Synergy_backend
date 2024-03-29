package com.team.synergy.apply;

import com.team.synergy.member.MemberRepository;
import com.team.synergy.project.Project;
import com.team.synergy.project.ProjectRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ApplyServiceTest {

    @Autowired
    ApplyService applyService;

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    ApplyRepository applyRepository;

    @DisplayName("프로젝트 신청")
    @Test
    void applyProject() throws Exception {
        //given
        LocalDateTime currentDate = LocalDateTime.now();
        List<Apply> applyList = new ArrayList<>();

//        Member member = Member.builder()
//                .name("이종훈")
//                .email("rivs@kakao.com")
//                .password("1234")
//                .createDate(currentDate)
//                .build();
//
//        memberRepository.save(member);


        Project project = Project.builder()
                .name("프로젝트 이름")
                .content("프로젝트 내용")
                .field("프로젝트 분야")
                .createDate(currentDate)
                .endDate(currentDate)
                .build();

        projectRepository.save(project);



        //when
//        Long applyId = applyService.apply(member.getId(), project.getId());

        //then
//        Apply getApply = applyRepository.findById(applyId).get();

//        ApplyStatus status = ApplyStatus.APPLY;
//        ApplyStatus applyStatus = getApply.getStatus();
//        System.out.println("status = " + status);
//        System.out.println("applyStatus = " + applyStatus);
//        Assert.assertEquals("신청시 상태는 APPLY", ApplyStatus.APPLY, getApply.getStatus());
//        Assert.assertEquals("신청한 멤버의 이름 : 이종훈", "이종훈", getApply.getMember().getName());
//        Assert.assertEquals("신청한 프로젝트의 이름 : 프로젝트 이름", "프로젝트 이름", getApply.getProject().getName());
    }

    @DisplayName("프로젝트 취소")
    @Test
    void cancelProject() throws Exception{
        //given
        LocalDateTime currentDate = LocalDateTime.now();
//
//        Member member = Member.builder()
//                .name("이종훈")
//                .email("rivs@kakao.com")
//                .password("1234")
//                .createDate(currentDate)
//                .build();

//        memberRepository.save(member);


        Project project = Project.builder()
                .name("프로젝트 이름")
                .content("프로젝트 내용")
                .field("프로젝트 분야")
                .createDate(currentDate)
                .endDate(currentDate)
                .build();

        projectRepository.save(project);

        //when
//        Long applyId = applyService.apply(member.getId(), project.getId());
//        applyService.cancelApply(applyId);
//
        //then
//        Apply getApply = applyRepository.findById(applyId).get();

        ApplyStatus status = ApplyStatus.CANCEL;
//        ApplyStatus applyStatus = getApply.getStatus();
//        System.out.println("status = " + status);
//        System.out.println("applyStatus = " + applyStatus);
//        Assert.assertEquals("취소시 상태는 CANCEL", status, applyStatus);
    }
}
