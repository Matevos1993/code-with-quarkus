package restmocker.backend.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Todo {

  private long id;
  private String todo;
  private Boolean completed;
  private long userId;
  private Date createdAt;
  private Date updatedAt;
}
