package br.atos.cadastro_animais_zoologico.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import br.atos.cadastro_animais_zoologico.enums.RoleName;



	@Entity
	@Table(name = "TB_role")
	public class RoleModel implements GrantedAuthority, Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long roleId;
		
		@Enumerated(EnumType.STRING)
		@Column(nullable = false, unique = true)
		private RoleName roleName;

		
		@Override
		public String getAuthority() {
			
			return this.roleName.toString() ;
		}


		

		public long getRoleId() {
			return roleId;
		}




		public void setRoleId(long roleId) {
			this.roleId = roleId;
		}




		public RoleName getRoleName() {
			return roleName;
		}


		public void setRoleName(RoleName roleName) {
			this.roleName = roleName;
		
	}

}
