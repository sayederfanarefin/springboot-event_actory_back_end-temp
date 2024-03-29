package com.sweetitech.tiger.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VideoCategory {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


	 @Column( unique=true)
    private String name;

    public VideoCategory() {
        super();
    }


    @Override
	public String toString() {
		return "VideoCategory [id=" + id + ", name=" + name + "]";
	}

	public VideoCategory(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }


}