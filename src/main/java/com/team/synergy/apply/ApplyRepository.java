package com.team.synergy.apply;

import com.team.synergy.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApplyRepository extends JpaRepository<Apply, Long> {

//    @Query("SELECT a.project_id FROM Apply a WHERE a.member_id = :member_id"
//    List<Apply> findBy

    List<Apply> findAppliesByMember(Member member);
}
