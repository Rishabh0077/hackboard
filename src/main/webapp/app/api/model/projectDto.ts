/**
 * Swagger Hackboard
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import { ApplicationDto } from './applicationDto';
import { ProjectRoleDto } from './projectRoleDto';


export interface ProjectDto {
    id?: number;
    title: string;
    description: string;
    ownerId?: number;
    ownerFirstName?: string;
    ownerLastName?: string;
    ownerLoginName?: string;
    color?: string;
    github?: string;
    projectStories?: Array<string>;
    projectRole?: Array<ProjectRoleDto>;
    applicationDto?: Array<ApplicationDto>;
    tags?: Array<string>;
}
