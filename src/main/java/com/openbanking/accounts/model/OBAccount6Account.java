package com.openbanking.accounts.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Provides the details to identify an account.
 */

@Schema(description = "Provides the details to identify an account.")
@Getter
@Setter
public class OBAccount6Account implements Serializable {
	private static final long serialVersionUID = 1L;

}
