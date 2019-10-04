/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import EJB.UserProject;
import java.util.List;

public interface UserProjectInterface {
    void create(UserProject b) throws UserProjectException;
    void edit(UserProject b) throws UserProjectException;
    void remove(UserProject b) throws UserProjectException;
    List<UserProject> findAll() ;
    UserProject findByID(Integer id) throws UserProjectException;
}
