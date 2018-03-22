package blockchains.iaas.uni.stuttgart.de.exceptions;

/********************************************************************************
 * Copyright (c) 2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 ********************************************************************************/
public class ManualUnsubscriptionException extends Exception {
    public ManualUnsubscriptionException() {
        super();
    }

    public ManualUnsubscriptionException(String message) {
        super(message);
    }

    public ManualUnsubscriptionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ManualUnsubscriptionException(Throwable cause) {
        super(cause);
    }

    protected ManualUnsubscriptionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
