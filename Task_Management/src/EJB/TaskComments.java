/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ardiit
 */
@Entity
@Table(name = "Task_Comments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TaskComments.findAll", query = "SELECT t FROM TaskComments t")
    , @NamedQuery(name = "TaskComments.findById", query = "SELECT t FROM TaskComments t WHERE t.id = :id")
    , @NamedQuery(name = "TaskComments.findByComment", query = "SELECT t FROM TaskComments t WHERE t.comment = :comment")})
public class TaskComments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "comment")
    private String comment;
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    @ManyToOne
    private Task taskId;
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    @ManyToOne
    private Users usersId;

    public TaskComments() {
    }

    public TaskComments(Integer id) {
        this.id = id;
    }

    public TaskComments(Integer id, String comment) {
        this.id = id;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Task getTaskId() {
        return taskId;
    }

    public void setTaskId(Task taskId) {
        this.taskId = taskId;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaskComments)) {
            return false;
        }
        TaskComments other = (TaskComments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.TaskComments[ id=" + id + " ]";
    }
    
}
