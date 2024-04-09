package academy.spring.observability.teahouse.waterservice.repo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public final class Water {
	@Id
	@GeneratedValue
	private final UUID id;
	@Column(
			unique = true,
			nullable = false
	)
	private final String size;
	@Column(
			unique = true,
			nullable = false
	)
	private final String amount;

//	public static WaterBuilder builder() {
//		return new WaterBuilder();
//	}

	public UUID getId() {
		return this.id;
	}

	public String getSize() {
		return this.size;
	}

	public String getAmount() {
		return this.amount;
	}

	public boolean equals(final Object o) {
		if (o == this) {
			return true;
		} else if (!(o instanceof Water)) {
			return false;
		} else {
			Water other;
			label44: {
				other = (Water)o;
				Object this$id = this.getId();
				Object other$id = other.getId();
				if (this$id == null) {
					if (other$id == null) {
						break label44;
					}
				} else if (this$id.equals(other$id)) {
					break label44;
				}

				return false;
			}

			Object this$size = this.getSize();
			Object other$size = other.getSize();
			if (this$size == null) {
				if (other$size != null) {
					return false;
				}
			} else if (!this$size.equals(other$size)) {
				return false;
			}

			Object this$amount = this.getAmount();
			Object other$amount = other.getAmount();
			if (this$amount == null) {
				if (other$amount != null) {
					return false;
				}
			} else if (!this$amount.equals(other$amount)) {
				return false;
			}

			return true;
		}
	}

	public int hashCode() {
		int result = 1;
		Object $id = this.getId();
		result = result * 59 + ($id == null ? 43 : $id.hashCode());
		Object $size = this.getSize();
		result = result * 59 + ($size == null ? 43 : $size.hashCode());
		Object $amount = this.getAmount();
		result = result * 59 + ($amount == null ? 43 : $amount.hashCode());
		return result;
	}

	public String toString() {
		String var10000 = String.valueOf(this.getId());
		return "Water(id=" + var10000 + ", size=" + this.getSize() + ", amount=" + this.getAmount() + ")";
	}

	public Water(final UUID id, final String size, final String amount) {
		this.id = id;
		this.size = size;
		this.amount = amount;
	}

	private Water() {
		this.id = null;
		this.size = null;
		this.amount = null;
	}
	/*
	public static class WaterBuilder {
		private UUID id;
		private String size;
		private String amount;

		WaterBuilder() {
		}

		public WaterBuilder id(final UUID id) {
			this.id = id;
			return this;
		}

		public WaterBuilder size(final String size) {
			this.size = size;
			return this;
		}

		public WaterBuilder amount(final String amount) {
			this.amount = amount;
			return this;
		}

		public Water build() {
			return new Water(this.id, this.size, this.amount);
		}

		public String toString() {
			String var10000 = String.valueOf(this.id);
			return "Water.WaterBuilder(id=" + var10000 + ", size=" + this.size + ", amount=" + this.amount + ")";
		}
	}

	 */
}

