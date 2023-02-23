package mbm.projectmgmapi.resources;

import mbm.projectmgmapi.entity.Project;
import mbm.projectmgmapi.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getProjects(){
        Project project = new Project();
        project.setName("Test");
//        projectRepository.save(project);
        return projectRepository.findAll();
    }
}
