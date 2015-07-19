/**
 * This class file was automatically generated by jASN1 (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.presentation.generated;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.LinkedList;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;

public final class CP_type {

	public final static class SubSeq_normal_mode_parameters {

		public final static BerIdentifier identifier = new BerIdentifier(BerIdentifier.UNIVERSAL_CLASS, BerIdentifier.CONSTRUCTED, 16);
		protected BerIdentifier id;

		public byte[] code = null;
		public BerBitString protocol_version = null;

		public BerOctetString calling_presentation_selector = null;

		public BerOctetString called_presentation_selector = null;

		public Context_list presentation_context_definition_list = null;

		public Default_context_name default_context_name = null;

		public BerBitString presentation_requirements = null;

		public BerBitString user_session_requirements = null;

		public User_data user_data = null;

		public SubSeq_normal_mode_parameters() {
			id = identifier;
		}

		public SubSeq_normal_mode_parameters(byte[] code) {
			id = identifier;
			this.code = code;
		}

		public SubSeq_normal_mode_parameters(BerBitString protocol_version, BerOctetString calling_presentation_selector, BerOctetString called_presentation_selector, Context_list presentation_context_definition_list, Default_context_name default_context_name, BerBitString presentation_requirements, BerBitString user_session_requirements, User_data user_data) {
			id = identifier;
			this.protocol_version = protocol_version;
			this.calling_presentation_selector = calling_presentation_selector;
			this.called_presentation_selector = called_presentation_selector;
			this.presentation_context_definition_list = presentation_context_definition_list;
			this.default_context_name = default_context_name;
			this.presentation_requirements = presentation_requirements;
			this.user_session_requirements = user_session_requirements;
			this.user_data = user_data;
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
				if (user_data != null) {
					codeLength += user_data.encode(berOStream, true);
				}
				
				if (user_session_requirements != null) {
					codeLength += user_session_requirements.encode(berOStream, false);
					codeLength += (new BerIdentifier(BerIdentifier.CONTEXT_CLASS, BerIdentifier.PRIMITIVE, 9)).encode(berOStream);
				}
				
				if (presentation_requirements != null) {
					codeLength += presentation_requirements.encode(berOStream, false);
					codeLength += (new BerIdentifier(BerIdentifier.CONTEXT_CLASS, BerIdentifier.PRIMITIVE, 8)).encode(berOStream);
				}
				
				if (default_context_name != null) {
					codeLength += default_context_name.encode(berOStream, false);
					codeLength += (new BerIdentifier(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 6)).encode(berOStream);
				}
				
				if (presentation_context_definition_list != null) {
					codeLength += presentation_context_definition_list.encode(berOStream, false);
					codeLength += (new BerIdentifier(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 4)).encode(berOStream);
				}
				
				if (called_presentation_selector != null) {
					codeLength += called_presentation_selector.encode(berOStream, false);
					codeLength += (new BerIdentifier(BerIdentifier.CONTEXT_CLASS, BerIdentifier.PRIMITIVE, 2)).encode(berOStream);
				}
				
				if (calling_presentation_selector != null) {
					codeLength += calling_presentation_selector.encode(berOStream, false);
					codeLength += (new BerIdentifier(BerIdentifier.CONTEXT_CLASS, BerIdentifier.PRIMITIVE, 1)).encode(berOStream);
				}
				
				if (protocol_version != null) {
					codeLength += protocol_version.encode(berOStream, false);
					codeLength += (new BerIdentifier(BerIdentifier.CONTEXT_CLASS, BerIdentifier.PRIMITIVE, 0)).encode(berOStream);
				}
				
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
				if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.PRIMITIVE, 0)) {
					protocol_version = new BerBitString();
					subCodeLength += protocol_version.decode(iStream, false);
					decodedIdentifier = false;
				}
			}
			if (subCodeLength < length.val) {
				if (decodedIdentifier == false) {
					subCodeLength += berIdentifier.decode(iStream);
					decodedIdentifier = true;
				}
				if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.PRIMITIVE, 1)) {
					calling_presentation_selector = new BerOctetString();
					subCodeLength += calling_presentation_selector.decode(iStream, false);
					decodedIdentifier = false;
				}
			}
			if (subCodeLength < length.val) {
				if (decodedIdentifier == false) {
					subCodeLength += berIdentifier.decode(iStream);
					decodedIdentifier = true;
				}
				if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.PRIMITIVE, 2)) {
					called_presentation_selector = new BerOctetString();
					subCodeLength += called_presentation_selector.decode(iStream, false);
					decodedIdentifier = false;
				}
			}
			if (subCodeLength < length.val) {
				if (decodedIdentifier == false) {
					subCodeLength += berIdentifier.decode(iStream);
					decodedIdentifier = true;
				}
				if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 4)) {
					presentation_context_definition_list = new Context_list();
					subCodeLength += presentation_context_definition_list.decode(iStream, false);
					decodedIdentifier = false;
				}
			}
			if (subCodeLength < length.val) {
				if (decodedIdentifier == false) {
					subCodeLength += berIdentifier.decode(iStream);
					decodedIdentifier = true;
				}
				if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 6)) {
					default_context_name = new Default_context_name();
					subCodeLength += default_context_name.decode(iStream, false);
					decodedIdentifier = false;
				}
			}
			if (subCodeLength < length.val) {
				if (decodedIdentifier == false) {
					subCodeLength += berIdentifier.decode(iStream);
					decodedIdentifier = true;
				}
				if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.PRIMITIVE, 8)) {
					presentation_requirements = new BerBitString();
					subCodeLength += presentation_requirements.decode(iStream, false);
					decodedIdentifier = false;
				}
			}
			if (subCodeLength < length.val) {
				if (decodedIdentifier == false) {
					subCodeLength += berIdentifier.decode(iStream);
					decodedIdentifier = true;
				}
				if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.PRIMITIVE, 9)) {
					user_session_requirements = new BerBitString();
					subCodeLength += user_session_requirements.decode(iStream, false);
					decodedIdentifier = false;
				}
			}
			if (subCodeLength < length.val) {
				if (decodedIdentifier == false) {
					subCodeLength += berIdentifier.decode(iStream);
					decodedIdentifier = true;
				}
				user_data = new User_data();
				choiceDecodeLength = user_data.decode(iStream, berIdentifier);
				if (choiceDecodeLength != 0) {
					decodedIdentifier = false;
					subCodeLength += choiceDecodeLength;
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

	public final static BerIdentifier identifier = new BerIdentifier(BerIdentifier.UNIVERSAL_CLASS, BerIdentifier.CONSTRUCTED, 17);
	protected BerIdentifier id;

	public byte[] code = null;
	public Mode_selector mode_selector = null;

	public SubSeq_normal_mode_parameters normal_mode_parameters = null;

	public CP_type() {
		id = identifier;
	}

	public CP_type(byte[] code) {
		id = identifier;
		this.code = code;
	}

	public CP_type(Mode_selector mode_selector, SubSeq_normal_mode_parameters normal_mode_parameters) {
		id = identifier;
		this.mode_selector = mode_selector;
		this.normal_mode_parameters = normal_mode_parameters;
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
			if (normal_mode_parameters != null) {
				codeLength += normal_mode_parameters.encode(berOStream, false);
				codeLength += (new BerIdentifier(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 2)).encode(berOStream);
			}
			
			codeLength += mode_selector.encode(berOStream, false);
			codeLength += (new BerIdentifier(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 0)).encode(berOStream);
			
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
		BerIdentifier berIdentifier = new BerIdentifier();

		if (explicit) {
			codeLength += id.decodeAndCheck(iStream);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(iStream);

		while (subCodeLength < length.val) {
			subCodeLength += berIdentifier.decode(iStream);
			if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 0)) {
				mode_selector = new Mode_selector();
				subCodeLength += mode_selector.decode(iStream, false);
			}
			else 
			if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 2)) {
				normal_mode_parameters = new SubSeq_normal_mode_parameters();
				subCodeLength += normal_mode_parameters.decode(iStream, false);
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

