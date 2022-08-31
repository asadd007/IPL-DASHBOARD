import { React, useEffect, useState } from 'react';
import './HomePage.scss';
import { TeamTile } from '../components/TeamTile';


export const HomePage = () => {
    let REACT_APP_API_ROOT_URL="http://localhost:8080"
    const [teams, setTeams] = useState([]);
    useEffect(
        () => {
         const fetchAllTeams = async () => {
            // const response = await fetch('http://localhost:8080/team');
            const response = await fetch(`${REACT_APP_API_ROOT_URL}/team`);
            console.log(response);
            const data = await response.json();
            console.log(data);
           setTeams(data);

         };
         fetchAllTeams();
            


        }, []
    );

    return (
        <div className="HomePage">
            <div className="header-section">
                <h1 className="app-name">Java Brains IPL Dashboard</h1>
            </div>
            <div className="team-grid">
                { teams.map(team => <TeamTile key={team.id} teamName={team.teamName} />)}
            </div>
        </div>
        
    );
}