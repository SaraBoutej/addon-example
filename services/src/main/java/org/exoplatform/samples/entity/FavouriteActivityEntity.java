package org.exoplatform.samples.entity;

import org.exoplatform.commons.api.persistence.ExoEntity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@ExoEntity
@Table (name="FAV_ACTIVITY")
@NamedQueries({
    @NamedQuery(name = "FavouriteActivityEntity.getFavouriteActivitybyId", query = "SELECT fa FROM FavouriteActivityEntity fa WHERE fa.ID = :favActId"),
    @NamedQuery(name = "FavouriteActivityEntity.getFavouriteActivitybyName", query = "SELECT fa FROM FavouriteActivityEntity fa WHERE fa.Title = :title")
})
public class FavouriteActivityEntity {

    @Id
    @SequenceGenerator(name = "SEQ_SOC_SPACES_ID", sequenceName = "SEQ_SOC_SPACES_ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_SOC_SPACES_ID")
    @Column(name = "FAVACT_ID")
    private long ID;
    @Column(name = "TITLE")
    private String Title;
    @Column(name = "FAV_DATE")
    private Calendar FavouritedDate;
    @Column(name = "ACTIVITY_ID")
    private Long TargetActivity;

    public FavouriteActivityEntity(long ID, String title, Calendar favouritedDate, Long targetActivity) {
        this.ID = ID;
        Title = title;
        FavouritedDate = favouritedDate;
        TargetActivity = targetActivity;
    }

    public FavouriteActivityEntity(String title, Calendar favouritedDate, Long targetActivity) {
        Title = title;
        FavouritedDate = favouritedDate;
        TargetActivity = targetActivity;
    }

    public FavouriteActivityEntity(String title, Calendar favouritedDate) {
        Title = title;
        FavouritedDate = favouritedDate;
    }

    public FavouriteActivityEntity(String title) {
        Title = title;
    }

    public FavouriteActivityEntity() {
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Long getTargetActivity() {
        return TargetActivity;
    }

        /*public void setTargetActivity(long targetActivity) {
            TargetActivity = targetActivity;
        }*/

    public Calendar getFavouritedDate() {
        return FavouritedDate;
    }

    public void setFavouritedDate(Calendar favouritedDate) {
        FavouritedDate = favouritedDate;
    }


    public void setTargetActivity(Long l) {
        TargetActivity = l;
    }



}
