/**
 * This class file was automatically generated by jASN1 (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.someexamples.generated;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.LinkedList;
import java.io.UnsupportedEncodingException;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;

public final class ImplBitString extends BerBitString {

	public final static BerIdentifier identifier = new BerIdentifier(BerIdentifier.APPLICATION_CLASS, BerIdentifier.PRIMITIVE, 3);

	public ImplBitString() {
		id = identifier;
	}

	public ImplBitString(byte[] bitString, int numBits) {
		id = identifier;
		if ((numBits <= (((bitString.length - 1) * 8) + 1)) || (numBits > (bitString.length * 8))) {
			throw new IllegalArgumentException("numBits out of bound.");
		}

		this.bitString = bitString;
		this.numBits = numBits;
	}

}