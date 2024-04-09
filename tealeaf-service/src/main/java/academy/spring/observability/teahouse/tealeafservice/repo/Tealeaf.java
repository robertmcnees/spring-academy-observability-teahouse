package academy.spring.observability.teahouse.tealeafservice.repo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public final class Tealeaf {
	@Id
	@GeneratedValue
	private final UUID id;
	@Column(
			unique = true,
			nullable = false
	)
	private final String name;
	@Column(
			nullable = false
	)
	private final String type;
	@Column(
			nullable = false
	)
	private final String suggestedAmount;
	@Column(
			nullable = false
	)
	private final String suggestedWaterTemperature;
	@Column(
			nullable = false
	)
	private final String suggestedSteepingTime;

	public static TealeafBuilder builder() {
		return new TealeafBuilder();
	}

	public UUID getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.type;
	}

	public String getSuggestedAmount() {
		return this.suggestedAmount;
	}

	public String getSuggestedWaterTemperature() {
		return this.suggestedWaterTemperature;
	}

	public String getSuggestedSteepingTime() {
		return this.suggestedSteepingTime;
	}

	public boolean equals(final Object o) {
		if (o == this) {
			return true;
		} else if (!(o instanceof Tealeaf)) {
			return false;
		} else {
			Tealeaf other = (Tealeaf)o;
			Object this$id = this.getId();
			Object other$id = other.getId();
			if (this$id == null) {
				if (other$id != null) {
					return false;
				}
			} else if (!this$id.equals(other$id)) {
				return false;
			}

			label73: {
				Object this$name = this.getName();
				Object other$name = other.getName();
				if (this$name == null) {
					if (other$name == null) {
						break label73;
					}
				} else if (this$name.equals(other$name)) {
					break label73;
				}

				return false;
			}

			Object this$type = this.getType();
			Object other$type = other.getType();
			if (this$type == null) {
				if (other$type != null) {
					return false;
				}
			} else if (!this$type.equals(other$type)) {
				return false;
			}

			label59: {
				Object this$suggestedAmount = this.getSuggestedAmount();
				Object other$suggestedAmount = other.getSuggestedAmount();
				if (this$suggestedAmount == null) {
					if (other$suggestedAmount == null) {
						break label59;
					}
				} else if (this$suggestedAmount.equals(other$suggestedAmount)) {
					break label59;
				}

				return false;
			}

			Object this$suggestedWaterTemperature = this.getSuggestedWaterTemperature();
			Object other$suggestedWaterTemperature = other.getSuggestedWaterTemperature();
			if (this$suggestedWaterTemperature == null) {
				if (other$suggestedWaterTemperature != null) {
					return false;
				}
			} else if (!this$suggestedWaterTemperature.equals(other$suggestedWaterTemperature)) {
				return false;
			}

			Object this$suggestedSteepingTime = this.getSuggestedSteepingTime();
			Object other$suggestedSteepingTime = other.getSuggestedSteepingTime();
			if (this$suggestedSteepingTime == null) {
				if (other$suggestedSteepingTime != null) {
					return false;
				}
			} else if (!this$suggestedSteepingTime.equals(other$suggestedSteepingTime)) {
				return false;
			}

			return true;
		}
	}

	public int hashCode() {
		int result = 1;
		Object $id = this.getId();
		result = result * 59 + ($id == null ? 43 : $id.hashCode());
		Object $name = this.getName();
		result = result * 59 + ($name == null ? 43 : $name.hashCode());
		Object $type = this.getType();
		result = result * 59 + ($type == null ? 43 : $type.hashCode());
		Object $suggestedAmount = this.getSuggestedAmount();
		result = result * 59 + ($suggestedAmount == null ? 43 : $suggestedAmount.hashCode());
		Object $suggestedWaterTemperature = this.getSuggestedWaterTemperature();
		result = result * 59 + ($suggestedWaterTemperature == null ? 43 : $suggestedWaterTemperature.hashCode());
		Object $suggestedSteepingTime = this.getSuggestedSteepingTime();
		result = result * 59 + ($suggestedSteepingTime == null ? 43 : $suggestedSteepingTime.hashCode());
		return result;
	}

	public String toString() {
		String var10000 = String.valueOf(this.getId());
		return "Tealeaf(id=" + var10000 + ", name=" + this.getName() + ", type=" + this.getType() + ", suggestedAmount=" + this.getSuggestedAmount() + ", suggestedWaterTemperature=" + this.getSuggestedWaterTemperature() + ", suggestedSteepingTime=" + this.getSuggestedSteepingTime() + ")";
	}

	public Tealeaf(final UUID id, final String name, final String type, final String suggestedAmount, final String suggestedWaterTemperature, final String suggestedSteepingTime) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.suggestedAmount = suggestedAmount;
		this.suggestedWaterTemperature = suggestedWaterTemperature;
		this.suggestedSteepingTime = suggestedSteepingTime;
	}

	private Tealeaf() {
		this.id = null;
		this.name = null;
		this.type = null;
		this.suggestedAmount = null;
		this.suggestedWaterTemperature = null;
		this.suggestedSteepingTime = null;
	}

	public static class TealeafBuilder {
		private UUID id;
		private String name;
		private String type;
		private String suggestedAmount;
		private String suggestedWaterTemperature;
		private String suggestedSteepingTime;

		TealeafBuilder() {
		}

		public TealeafBuilder id(final UUID id) {
			this.id = id;
			return this;
		}

		public TealeafBuilder name(final String name) {
			this.name = name;
			return this;
		}

		public TealeafBuilder type(final String type) {
			this.type = type;
			return this;
		}

		public TealeafBuilder suggestedAmount(final String suggestedAmount) {
			this.suggestedAmount = suggestedAmount;
			return this;
		}

		public TealeafBuilder suggestedWaterTemperature(final String suggestedWaterTemperature) {
			this.suggestedWaterTemperature = suggestedWaterTemperature;
			return this;
		}

		public TealeafBuilder suggestedSteepingTime(final String suggestedSteepingTime) {
			this.suggestedSteepingTime = suggestedSteepingTime;
			return this;
		}

		public Tealeaf build() {
			return new Tealeaf(this.id, this.name, this.type, this.suggestedAmount, this.suggestedWaterTemperature, this.suggestedSteepingTime);
		}

		public String toString() {
			String var10000 = String.valueOf(this.id);
			return "Tealeaf.TealeafBuilder(id=" + var10000 + ", name=" + this.name + ", type=" + this.type + ", suggestedAmount=" + this.suggestedAmount + ", suggestedWaterTemperature=" + this.suggestedWaterTemperature + ", suggestedSteepingTime=" + this.suggestedSteepingTime + ")";
		}
	}
}
