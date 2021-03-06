package com.fumidzuki.dao;

import java.util.List;

import com.fumidzuki.entity.AccountTwo;

import org.seasar.doma.AnnotateWith;
import org.seasar.doma.Annotation;
import org.seasar.doma.AnnotationTarget;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Dao
@AnnotateWith(annotations = {@Annotation(target = AnnotationTarget.CLASS, type = Repository.class),
    @Annotation(target = AnnotationTarget.CONSTRUCTOR, type = Autowired.class),
    @Annotation(target = AnnotationTarget.CONSTRUCTOR_PARAMETER, type = Qualifier.class,
        elements = "\"databaseTwoConfig\"")})
public interface DatabaseTwoDao {

  @Select
  public List<AccountTwo> selectAll();

}
