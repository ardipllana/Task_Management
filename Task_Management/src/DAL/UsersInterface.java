/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import EJB.Users;
import java.util.List;

public interface UsersInterface {
    void create(Users b) throws UsersException;
    void edit(Users b) throws UsersException;
    void remove(Users b) throws UsersException;
    List<Users> findAll() ;
    Users findByID(Integer id) throws UsersException;
}
