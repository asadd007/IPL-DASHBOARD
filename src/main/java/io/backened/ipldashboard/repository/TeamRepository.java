package io.backened.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.backened.ipldashboard.Model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
