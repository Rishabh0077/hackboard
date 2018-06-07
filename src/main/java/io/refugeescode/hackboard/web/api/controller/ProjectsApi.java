/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.refugeescode.hackboard.web.api.controller;

import io.refugeescode.hackboard.service.dto.ProjectDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Api(value = "projects", description = "the projects API")
public interface ProjectsApi {

    Logger log = LoggerFactory.getLogger(ProjectsApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Add a new project", nickname = "addProject", notes = "", response = Boolean.class, tags={ "project", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Boolean.class) })
    @RequestMapping(value = "/projects",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Boolean> addProject(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ProjectDto project) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProjectsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Delete Project", nickname = "deleteProject", notes = "", response = Boolean.class, tags={ "project", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Boolean.class) })
    @RequestMapping(value = "/projects/{projectId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Boolean> deleteProject(@ApiParam(value = "ID of project",required=true) @PathVariable("projectId") Long projectId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProjectsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Edit project", nickname = "editProject", notes = "", response = Boolean.class, tags={ "project", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Boolean.class) })
    @RequestMapping(value = "/projects",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<Boolean> editProject(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ProjectDto project) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProjectsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "List all projects", nickname = "listProjects", notes = "", response = ProjectDto.class, responseContainer = "List", tags={ "project", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProjectDto.class, responseContainer = "List") })
    @RequestMapping(value = "/projects",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<ProjectDto>> listProjects() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"projectStories\" : [ \"projectStories\", \"projectStories\" ],  \"ownerLastName\" : \"ownerLastName\",  \"github\" : \"github\",  \"projectRole\" : [ {    \"color\" : \"color\",    \"roleName\" : \"roleName\",    \"count\" : 5,    \"id\" : 1  }, {    \"color\" : \"color\",    \"roleName\" : \"roleName\",    \"count\" : 5,    \"id\" : 1  } ],  \"applicationDto\" : [ {    \"roleId\" : 9,    \"roleColor\" : \"roleColor\",    \"applicantFullName\" : \"applicantFullName\",    \"roleName\" : \"roleName\",    \"id\" : 5,    \"projectId\" : 7,    \"applicant\" : 2,    \"userGithub\" : \"userGithub\"  }, {    \"roleId\" : 9,    \"roleColor\" : \"roleColor\",    \"applicantFullName\" : \"applicantFullName\",    \"roleName\" : \"roleName\",    \"id\" : 5,    \"projectId\" : 7,    \"applicant\" : 2,    \"userGithub\" : \"userGithub\"  } ],  \"description\" : \"description\",  \"ownerLoginName\" : \"ownerLoginName\",  \"id\" : 0,  \"ownerFirstName\" : \"ownerFirstName\",  \"title\" : \"title\",  \"ownerId\" : 6}, {  \"projectStories\" : [ \"projectStories\", \"projectStories\" ],  \"ownerLastName\" : \"ownerLastName\",  \"github\" : \"github\",  \"projectRole\" : [ {    \"color\" : \"color\",    \"roleName\" : \"roleName\",    \"count\" : 5,    \"id\" : 1  }, {    \"color\" : \"color\",    \"roleName\" : \"roleName\",    \"count\" : 5,    \"id\" : 1  } ],  \"applicationDto\" : [ {    \"roleId\" : 9,    \"roleColor\" : \"roleColor\",    \"applicantFullName\" : \"applicantFullName\",    \"roleName\" : \"roleName\",    \"id\" : 5,    \"projectId\" : 7,    \"applicant\" : 2,    \"userGithub\" : \"userGithub\"  }, {    \"roleId\" : 9,    \"roleColor\" : \"roleColor\",    \"applicantFullName\" : \"applicantFullName\",    \"roleName\" : \"roleName\",    \"id\" : 5,    \"projectId\" : 7,    \"applicant\" : 2,    \"userGithub\" : \"userGithub\"  } ],  \"description\" : \"description\",  \"ownerLoginName\" : \"ownerLoginName\",  \"id\" : 0,  \"ownerFirstName\" : \"ownerFirstName\",  \"title\" : \"title\",  \"ownerId\" : 6} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProjectsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "View Project", nickname = "viewProject", notes = "", response = ProjectDto.class, tags={ "project", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProjectDto.class) })
    @RequestMapping(value = "/projects/{projectId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ProjectDto> viewProject(@ApiParam(value = "ID of project",required=true) @PathVariable("projectId") Long projectId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"projectStories\" : [ \"projectStories\", \"projectStories\" ],  \"ownerLastName\" : \"ownerLastName\",  \"github\" : \"github\",  \"projectRole\" : [ {    \"color\" : \"color\",    \"roleName\" : \"roleName\",    \"count\" : 5,    \"id\" : 1  }, {    \"color\" : \"color\",    \"roleName\" : \"roleName\",    \"count\" : 5,    \"id\" : 1  } ],  \"applicationDto\" : [ {    \"roleId\" : 9,    \"roleColor\" : \"roleColor\",    \"applicantFullName\" : \"applicantFullName\",    \"roleName\" : \"roleName\",    \"id\" : 5,    \"projectId\" : 7,    \"applicant\" : 2,    \"userGithub\" : \"userGithub\"  }, {    \"roleId\" : 9,    \"roleColor\" : \"roleColor\",    \"applicantFullName\" : \"applicantFullName\",    \"roleName\" : \"roleName\",    \"id\" : 5,    \"projectId\" : 7,    \"applicant\" : 2,    \"userGithub\" : \"userGithub\"  } ],  \"description\" : \"description\",  \"ownerLoginName\" : \"ownerLoginName\",  \"id\" : 0,  \"ownerFirstName\" : \"ownerFirstName\",  \"title\" : \"title\",  \"ownerId\" : 6}", ProjectDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProjectsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
