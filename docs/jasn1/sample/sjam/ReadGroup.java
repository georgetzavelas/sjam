/**
 * This class file was automatically generated by jASN1 (http://www.openmuc.org)
 */

package sjam;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.LinkedList;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;

public final class ReadGroup {

	public final static BerIdentifier identifier = new BerIdentifier(BerIdentifier.APPLICATION_CLASS, BerIdentifier.CONSTRUCTED, 4);
	protected BerIdentifier id;

	public byte[] code = null;
	public BerVisibleString identifier = null;

	public BerVisibleString centerName = null;

	public BerVisibleString description = null;

	public BerVisibleString date = null;

	public BerVisibleString flowOrder = null;

	public BerVisibleString keySequence = null;

	public BerVisibleString library = null;

	public BerVisibleString program = null;

	public BerInteger predictedMedianInsertSize = null;

	public Platform platform = null;

	public BerVisibleString platformUnit = null;

	public BerVisibleString sample = null;

	public ReadGroup() {
		id = identifier;
	}

	public ReadGroup(byte[] code) {
		id = identifier;
		this.code = code;
	}

	public ReadGroup(BerVisibleString identifier, BerVisibleString centerName, BerVisibleString description, BerVisibleString date, BerVisibleString flowOrder, BerVisibleString keySequence, BerVisibleString library, BerVisibleString program, BerInteger predictedMedianInsertSize, Platform platform, BerVisibleString platformUnit, BerVisibleString sample) {
		id = identifier;
		this.identifier = identifier;
		this.centerName = centerName;
		this.description = description;
		this.date = date;
		this.flowOrder = flowOrder;
		this.keySequence = keySequence;
		this.library = library;
		this.program = program;
		this.predictedMedianInsertSize = predictedMedianInsertSize;
		this.platform = platform;
		this.platformUnit = platformUnit;
		this.sample = sample;
	}

	public int encode(BerByteArrayOutputStream berOStream, boolean explicit) throws IOException {

		int codeLength;

		if (code != null) {
			codeLength = code.length;
			for (int i = code.length - 1; i >= 0; i--) {
				berOStream.write(code[i]);
			}
		}
		else {
			codeLength = 0;
			if (sample != null) {
				codeLength += sample.encode(berOStream, true);
			}
			
			if (platformUnit != null) {
				codeLength += platformUnit.encode(berOStream, true);
			}
			
			if (platform != null) {
				codeLength += platform.encode(berOStream, true);
			}
			
			if (predictedMedianInsertSize != null) {
				codeLength += predictedMedianInsertSize.encode(berOStream, true);
			}
			
			if (program != null) {
				codeLength += program.encode(berOStream, true);
			}
			
			if (library != null) {
				codeLength += library.encode(berOStream, true);
			}
			
			if (keySequence != null) {
				codeLength += keySequence.encode(berOStream, true);
			}
			
			if (flowOrder != null) {
				codeLength += flowOrder.encode(berOStream, true);
			}
			
			if (date != null) {
				codeLength += date.encode(berOStream, true);
			}
			
			if (description != null) {
				codeLength += description.encode(berOStream, true);
			}
			
			if (centerName != null) {
				codeLength += centerName.encode(berOStream, true);
			}
			
			codeLength += identifier.encode(berOStream, true);
			
			codeLength += BerLength.encodeLength(berOStream, codeLength);
		}

		if (explicit) {
			codeLength += id.encode(berOStream);
		}

		return codeLength;

	}

	public int decode(InputStream iStream, boolean explicit) throws IOException {
		int codeLength = 0;
		int subCodeLength = 0;
		int choiceDecodeLength = 0;
		BerIdentifier berIdentifier = new BerIdentifier();
		boolean decodedIdentifier = false;

		if (explicit) {
			codeLength += id.decodeAndCheck(iStream);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(iStream);

		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerVisibleString.identifier)) {
				identifier = new BerVisibleString();
				subCodeLength += identifier.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerVisibleString.identifier)) {
				centerName = new BerVisibleString();
				subCodeLength += centerName.decode(iStream, false);
				decodedIdentifier = false;
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerVisibleString.identifier)) {
				description = new BerVisibleString();
				subCodeLength += description.decode(iStream, false);
				decodedIdentifier = false;
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerVisibleString.identifier)) {
				date = new BerVisibleString();
				subCodeLength += date.decode(iStream, false);
				decodedIdentifier = false;
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerVisibleString.identifier)) {
				flowOrder = new BerVisibleString();
				subCodeLength += flowOrder.decode(iStream, false);
				decodedIdentifier = false;
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerVisibleString.identifier)) {
				keySequence = new BerVisibleString();
				subCodeLength += keySequence.decode(iStream, false);
				decodedIdentifier = false;
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerVisibleString.identifier)) {
				library = new BerVisibleString();
				subCodeLength += library.decode(iStream, false);
				decodedIdentifier = false;
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerVisibleString.identifier)) {
				program = new BerVisibleString();
				subCodeLength += program.decode(iStream, false);
				decodedIdentifier = false;
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerInteger.identifier)) {
				predictedMedianInsertSize = new BerInteger();
				subCodeLength += predictedMedianInsertSize.decode(iStream, false);
				decodedIdentifier = false;
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			platform = new Platform();
			choiceDecodeLength = platform.decode(iStream, berIdentifier);
			if (choiceDecodeLength != 0) {
				decodedIdentifier = false;
				subCodeLength += choiceDecodeLength;
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerVisibleString.identifier)) {
				platformUnit = new BerVisibleString();
				subCodeLength += platformUnit.decode(iStream, false);
				decodedIdentifier = false;
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerVisibleString.identifier)) {
				sample = new BerVisibleString();
				subCodeLength += sample.decode(iStream, false);
				decodedIdentifier = false;
			}
		}
		if (subCodeLength != length.val) {
			throw new IOException("Decoded sequence has wrong length tag");

		}
		codeLength += subCodeLength;

		return codeLength;
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		BerByteArrayOutputStream berOStream = new BerByteArrayOutputStream(encodingSizeGuess);
		encode(berOStream, false);
		code = berOStream.getArray();
	}
}

