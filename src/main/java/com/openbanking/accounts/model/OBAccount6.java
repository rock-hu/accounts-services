package com.openbanking.accounts.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Unambiguous identification of the account to which credit and debit entries are made. The following fields are
 * optional only for accounts that are switched: * Data.Currency * Data.AccountType * Data.AccountSubType For all other
 * accounts, the fields must be populated by the ASPSP.
 */

@Schema(
		description = "Unambiguous identification of the account to which credit and debit entries are made. The following fields are optional only for accounts that are switched:    * Data.Currency     * Data.AccountType     * Data.AccountSubType  For all other accounts, the fields must be populated by the ASPSP.")
@Getter
@Setter
public class OBAccount6 implements Serializable {
	private static final long serialVersionUID = 1L;

}
