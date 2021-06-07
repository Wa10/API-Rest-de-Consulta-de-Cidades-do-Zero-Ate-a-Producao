package com.github.walacealves.citiesapi.cities;

import com.github.walacealves.citiesapi.states.State;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.*;

@Entity
@Table(name = "cidade")
@TypeDefs(value = {
        @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private State uf;

    private Integer ibge;

    private Double latitude;

    private Double longitude;

    // 2nd
    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;

    public City() {
    }

//    public City(final Long id, final String name, final Integer uf, final Integer ibge,
//                final String geolocation, final Point location) {
//        this.id = id;
//        this.name = name;
//        this.uf = uf;
//        this.ibge = ibge;
//        this.geolocation = geolocation;
//        this.location = location;
//    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf.getName();
    }

    public Integer getIbge() {
        return ibge;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

        public Point getLocation() {
        return location;
    }
}
